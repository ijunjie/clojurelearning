(defn hypot
  [x y]
  (let [x2 (* x x) 
        y2 (* y y)]
    (Math/sqrt (+ x2 y2))))
(hypot 3 4)

(defn myreverse
  [coll]
  (loop [s coll 
         r []]
    (if (empty? s) 
      r
      (recur (rest s) (cons (first s) r)))))
(myreverse [1 2 3 4 5])
(myreverse '(1 2 3 4 5))
(myreverse '("a" "b" "c"))
