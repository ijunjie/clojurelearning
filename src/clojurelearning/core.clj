(ns clojurelearning.core
  (:gen-class))

(require '[clojurelearning.ch2logger :as logger])


(def mymem (java.io.StringWriter.))



(defn -main []
   (logger/clear-file logger/logfile)
   ((logger/print-logger *out*) "hello to std")
   ((logger/print-logger mymem) "hello to mem")
   (println (str mymem))
   ((logger/file-logger logger/logfile) "hello to file")
   (logger/log "hello both std and file"))

  

