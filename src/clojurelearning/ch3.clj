(ns clojurelearning.ch3)
; cons always returns a seq while conj returns a same type
(def v [1 2 3])
(conj v 4)
(cons 4 v)

(def m {:a 5 :b 6})
(conj m [:c 7])

(def s #{1 2 3})
(cons 5 s)
(conj s 5)

(conj '(1 2 3) 4)
(cons 4 '(1 2 3))

(drop 1 '(1 2 3))
;'(0 1 2 3 4 5 6 7 8 9)
(take-nth 3 (range 10))


(def seq10 (apply list (range 10)))
(def vec10 (apply vector (range 10)))
(def a (take-nth 2 (drop 1 seq10)))
(def b (take-nth 2 seq10))
(def c (take-nth 2 (drop 1 vec10)))
(def d (take-nth 2 vec10))
(interleave a b)
(interleave c d)

(defn map-map
  [f m]
  (into (empty m)
    (for [[k v] m]
      [k (f v)])))

(map-map inc (hash-map :z 5 :c 6 :a 0))
(map-map inc (sorted-map :z 5 :c 6 :a 0))























