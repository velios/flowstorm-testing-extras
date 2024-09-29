# Reason

Small helper which help find testing sections when you use flowstorm.
As result of discussion https://github.com/flow-storm/flow-storm-debugger/issues/187

# Installation

1. Download this repo
2. Execute `lein install` in root repo folder to store package in your local maven cache ~/.m2

# Usage

If your project uses lein, your project.clj file should look something like this :

```clojure
(defproject my.project "1.0.0"
  :profiles {:dev {:dependencies [[im.chit/vinyasa "0.4.7"]
                                  [flowstorm-testing-extras "0.0.1-SNAPSHOT"]]
                   :injections [(require '[vinyasa.inject :as inject])
                                (inject/inject '[clojure.test [flowstorm-testing-extras.core testing]])]}}
  :main foo.core)
```
