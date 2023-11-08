import { defineConfig } from "vite";
import scalaJSPlugin from "@scala-js/vite-plugin-scalajs";
// import importSideEffectPlugin from "@raquo/vite-plugin-import-side-effect";
import globResolverPlugin from "@raquo/vite-plugin-glob-resolver";

export default defineConfig({
    plugins: [scalaJSPlugin(),
              globResolverPlugin({
                  cwd: __dirname,
                  ignore: [
                      'node_modules/**',
                      'target/**'
                  ]
              }),
              // XXX:  This plugin overrides importt and break exported vars
              // importSideEffectPlugin({
              //     // See https://github.com/raquo/vite-plugin-import-side-effect
              //     defNames: ["importStyle"],
              //     rewriteModuleIds: ['**/*.css', '**/*.less'],
              //     verbose: true
              // }),
             ],
});
