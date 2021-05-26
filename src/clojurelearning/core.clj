(ns clojurelearning.core
  (:gen-class))

(require '(clojurelearning [ch2logger :as logger]
                           [ch2 :as ch2] 
                           [ch3 :as ch3]))



(def mymem (java.io.StringWriter.))

(def x (next (ch3/random-ints 50)))


(defn -main []
   #_(logger/clear-file logger/logfile)
   #_((logger/print-logger *out*) "hello to std")
   #_((logger/print-logger mymem) "hello to mem")
   #_(println (str mymem))
   #_((logger/file-logger logger/logfile) "hello to file")
   #_(logger/log "hello both std and file")
   #_(logger/log-timestamped "hello timestamped to both std and file")
   #_(time (ch2/m-prime? 1125899906842679))
   #_(time (ch2/m-prime? 1125899906842679))
   #_(println "ch3")
   #_(count ch3/rands)
   #_(println (repeatedly 10 (partial rand-int 50)))
   (println "hello"))

  

