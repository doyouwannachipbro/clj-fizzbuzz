(ns clj-fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [clj-fizzbuzz.core :refer :all]))

(describe "fizzbuzz"
  (it "returns 1 for fizzbuzz of 1"
  (should= 1 (fizzbuzz 1))))
