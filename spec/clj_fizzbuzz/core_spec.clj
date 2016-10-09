(ns clj-fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [clj-fizzbuzz.core :refer :all]))

(describe "fizzbuzz"
  (it "returns 1 for fizzbuzz of 1"
    (should= 1 (fizzbuzz 1)))

  (it "returns fizz for fizzbuzz of 3"
    (should= "fizz" (fizzbuzz 3)))

  )
