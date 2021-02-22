(ns clojurelearning.ch2logger)


(def logfile "messages.log")

(defn clear-file
  [file]
  (with-open [f (clojure.java.io/writer file :append false)]
    (.write f "")))

(defn print-logger
  [writer]
  #(binding [*out* writer]
     (println %)))
(defn file-logger
  [file]
  #(with-open [f (clojure.java.io/writer file :append true)]
     ((print-logger f) %)))
(defn multi-logger
  [& logger-fns]
  #(doseq [f logger-fns]
     (f %)))
(def log (multi-logger
           (print-logger *out*)
           (file-logger logfile)))

