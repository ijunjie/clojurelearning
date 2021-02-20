(ns clojurelearning.ch2)

(defn call-twice
  [f x]
  (f x)
  (f x))

(call-twice println 123)

(max 5 6)
(clojure.string/lower-case "Clojure")


(map #(* % 2) [1 2 3])
(map * [1 2 3] [4 5 6])

(reduce max [0 -3 10 48])
(reduce max 50 [0 -3 10 48])
(reduce + 50 [1 2 3 4])

(reduce 
  (fn 
    [m v] 
    (assoc m v (* v v))) 
  {} 
  [1 2 3 4])

(def only-strings (partial filter string?))
(only-strings [1 "aa" 2 :a])

(#(apply map * %&) [1 2 3])
(#(apply map * %&) [1 2 3] [4 5 6])
((partial map *) [1 2 3] [4 5 6])


(defn negated-sum-str
  [& numbers]
  (str (- (apply + numbers))))
(negated-sum-str 10 12 3.4)


(def negated-sum-str2 (comp str - +))
(negated-sum-str2 10 12 3.4)



(def camel->keyword (comp keyword
                      clojure.string/join
                      (partial interpose \-)
                      (partial map clojure.string/lower-case)
                      #(clojure.string/split % #"(?<=[a-z])(?=[A-Z])")))

(camel->keyword "CamelCase")


