;; 1 - This is a clojure form. Enter a value which will make the form evaluate to true. Don't over think it! If you are confused, see the getting started page. Hint: true is equal to true.
(= true true)

;; 2 - If you are not familiar with polish notation, simple arithmetic might seem confusing.
4

;; 3 - Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.
"HELLO WORLD"

;; 4 - Lists can be constructed with either a function or a quoted form.
:a,:b,:c

;; 5 - When operating on a list, the conj function will return a new list with one or more items "added" to the front.
'(1,2,3,4)

;; 6 - 

;; 21 - Write a function which returns the Nth element from a sequence.
(f [l, i] (last (take (inc i) l)))

;; 23 - Write a function which reverses a sequence.
(fn [l] (into '() l))

;; 24 - Write a function which returns the sum of a sequence of numbers.
reduce +

;; 25 - Write a function which returns only the odd numbers from a sequence.
filter #(= 1 (rem % 2))

;; 26 - Write a function which returns the first X fibonacci numbers.


;; 35 - Clojure lets you give local names to values using the special let-form.
7