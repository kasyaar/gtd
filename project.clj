(defproject gtd "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  

  :main gtd.core
  :aot [gtd.core]
  :uberjar-name "gtd.jar"
  :source-paths  ["src/clj"]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src/cljs"]
                        :compiler {
                                   :output-to "resources/public/script/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :dependencies [
                 [http-kit "2.1.16"]
                 [ring "1.2.1"]
                 [compojure "1.1.6"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2322"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.7.1"]
                 [prismatic/dommy "1.0.0"]
                 [clj-oauth "1.5.1"]
                 [twitter-api "0.7.7"]
                 [hbs "0.6.0"]
                 [com.ashafa/clutch "0.4.0"]
                 [cheshire "5.3.1"]
                 ]

  :min-lein-version "2.0.0")
