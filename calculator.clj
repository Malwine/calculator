;;calculator

(defn add [a b]
(+ a b))

;;call add function
(add 1 2)

(defn sub [a b]
(- a b))

;;call substraction function
(sub 4 8)

(defn multiply [a b]
(* a b))

;;call multiply function
(multiply 2 8)

(defn divide [a b]
  (if (not (= b 0))
     (do (/ a b) (/ a b))
     (do (println "Can't devide by 0!") "Can't devide by 0!" )))

;;call the divide function
(divide 6 3)
(divide 5 0)
