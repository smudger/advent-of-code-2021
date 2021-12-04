(ns day01.core-spec
  (:require [speclj.core :refer :all]
            [day01.core :refer :all]))

(describe "The puzzle solvers"
  (it "should solve puzzle 1"
    (should= 7 (solve-1 "199\n200\n208\n210\n200\n207\n240\n269\n260\n263")))
  (it "should solve puzzle 2"
    (should= 5 (solve-2 "199\n200\n208\n210\n200\n207\n240\n269\n260\n263"))))
