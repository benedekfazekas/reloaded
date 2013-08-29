(ns project-repl.{{name}}
    "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application."
  (:require
     [clojure.java.io :as io]
     [clojure.java.javadoc :refer (javadoc)]
     [clojure.pprint :refer (pprint)]
     [clojure.reflect :refer (reflect)]
     [clojure.repl :refer (apropos dir doc find-doc pst source)]
     [clojure.set :as set]
     [clojure.string :as str]
     [clojure.test :as test]
     [clojure.tools.namespace.repl :refer :all]
     [clojure.tools.namespace.move :refer :all]))

(def dev-{{name}})

(defn create-and-start-dev-{{name}}
  "Creates and starts dev system instance, updates var dev-{{name}}"
  []
  ;;TODO
  )

(defn stop-dev-{{name}}
  "Stops the dev system if it is running, updates var dev-{{name}}"
  []
  ;;TODO
  )

(defn reset-dev-{{name}}
  "Stops the dev system, reloads modified source files and restarts the system."
  []
  (stop-dev-{{name}})
  (refresh :after 'project-repl.{{name}}/create-and-start-dev-{{name}}))
