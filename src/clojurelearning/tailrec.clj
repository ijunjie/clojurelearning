(ns clojurelearning.tailrec)

(defn reverse
  [coll]
  (loop [s coll
         r []]
    (if (empty? s) 
      r
      (recur (rest s) (cons (first s) r)))))
(reverse [1 2 3 4])

(defn fibonacci
  [n]
  (loop [a 0
         b 1
         i 0]
    (if (= i n) 
      b
      (recur b (+ a b) (+ i 1)))))
(map fibonacci (range 10))


(defn factorial
  [n]
  (loop [r 1
         i 1]
    (if (= (- i 1) n)
      r
      (recur (* r i) (+ i 1)))))
(factorial 5)
