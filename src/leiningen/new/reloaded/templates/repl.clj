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

(def system
  nil)

(defn create-and-start
  "Creates and starts system instance, updates var system"
  []
  ;;TODO
  )

(defn stop
  "Stops the system if it is running, updates var system"
  []
  ;;TODO
  )

(defn reset
  "Stops the system, reloads modified source files and restarts the system."
  []
  (stop)
  (refresh :after 'project-repl.{{name}}/create-and-start))
