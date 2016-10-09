(ns clj-fizzbuzz.core)

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "fizzbuzz"
    (= 0 (mod n 5)) "buzz"
    (= 0 (mod n 3)) "fizz"
    :else n))

(defn fizzbuzz-upto [n]
  (map fizzbuzz (range 1 (inc n))))

(defn print-fizzbuzz-upto [n]
  (doseq [fb-val (fizzbuzz-upto 10)]
    (println fb-val)))
