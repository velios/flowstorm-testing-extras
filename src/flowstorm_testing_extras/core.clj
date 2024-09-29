(ns flowstorm-testing-extras.core)

(defmacro testing [string & body]
  `((fn ~(symbol (clojure.string/lower-case (clojure.string/replace string " " "_"))) [x#]
      ~@body)
    ~string))
