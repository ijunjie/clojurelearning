(ns clojurelearning.core
  (:gen-class))

(require '(clojurelearning [ch2logger :as logger]
                           [ch2 :as ch2]))



(def mymem (java.io.StringWriter.))



(defn -main []
   #_(logger/clear-file logger/logfile)
   #_((logger/print-logger *out*) "hello to std")
   #_((logger/print-logger mymem) "hello to mem")
   #_(println (str mymem))
   #_((logger/file-logger logger/logfile) "hello to file")
   #_(logger/log "hello both std and file")
   #_(logger/log-timestamped "hello timestamped to both std and file")
   (time (ch2/m-prime? 1125899906842679))
   (time (ch2/m-prime? 1125899906842679))
   (println "hello"))

  

