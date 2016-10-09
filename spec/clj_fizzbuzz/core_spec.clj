(ns clj-fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [clj-fizzbuzz.core :refer :all]))

(describe "fizzbuzz"
  (let [test-cases [[1 1]
                    [3 "fizz"]
                    [6 "fizz"]
                    [5 "buzz"]
                    [10 "buzz"]
                    [15 "fizzbuzz"]
                    [30 "fizzbuzz"]
                    ]]
    (for [[value expected] test-cases]
      (it (str "returns " expected " for fizzbuzz of " value)
        (should= expected (fizzbuzz value)))))

  (it "returns a list of fizzbuzz from 1 to 10"
    (should= '(1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz")
                 (fizzbuzz-upto 10))))

