(ns clojurelearning.ch2logger)

(defn print-logger
  [writer]
  #(binding [*out* writer]
     (println %)))
; 1. std
(def *out*-logger (print-logger *out*))
; 2. mem
(def mem-writer (java.io.StringWriter.))
(def mem-logger (print-logger mem-writer))
; 3. file

