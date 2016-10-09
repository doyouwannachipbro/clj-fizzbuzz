(ns clj-fizzbuzz.core)

(defn fizzbuzz [n]
  (cond
    (= n 3) "fizz"
    :else n))
