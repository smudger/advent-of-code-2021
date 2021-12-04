(ns day01.core)

(defn solve-1 [input] (->>
                        (->
                          input
                          (clojure.string/split-lines))
                        (map #(Integer/parseInt %))  
                        (partition 2 1)
                        (map #(reduce - %))
                        (filter #(< % 0))
                        (count)))

(defn solve-2 [input] (->>
                        (->
                          input
                          (clojure.string/split-lines))
                        (map #(Integer/parseInt %))  
                        (partition 3 1)
                        (map #(reduce + %))
                        (partition 2 1)
                        (map #(reduce - %))
                        (filter #(< % 0))
                        (count)))

(defn -main
  [& args]
  (println (solve-1 (slurp "resources/depths.txt")))
  (println (solve-2 (slurp "resources/depths.txt"))))
  
