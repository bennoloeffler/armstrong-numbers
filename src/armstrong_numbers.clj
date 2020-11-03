(ns armstrong-numbers)

(defn armstrong? [num] 
  (let [num-str (str num)
        len (count num-str)]
  (->> num-str
       (map #(Math/pow (Character/digit % 10) len))
       (reduce +)
       (== num))))
