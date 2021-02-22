(ns clojurelearning.core
  (:gen-class))

(require 'clojurelearning.ch2logger)

(defn -main []
  #_(println "Hello, World!")
  (clojurelearning.ch2logger/*out*-logger "hello to std")
  (clojurelearning.ch2logger/mem-logger "hello to mem")
  (println (str clojurelearning.ch2logger/mem-writer)))

