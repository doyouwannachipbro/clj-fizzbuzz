(ns clj-fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [clj-fizzbuzz.core :refer :all]))

(describe "fizzbuzz"
  (let [test-cases [[1 1]
                    [3 "fizz"]
                    [6 "fizz"]
                    [5 "buzz"]
                    [10 "buzz"]
                    ]]
    (for [[value expected] test-cases]
      (it (str "returns " expected " for fizzbuzz of " value)
        (should= expected (fizzbuzz value))))))

