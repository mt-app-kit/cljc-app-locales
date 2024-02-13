
(ns app-locales.name.utils
    (:require [app-locales.core.state  :as core.state]
              [app-locales.name.config :as name.config]
              [fruits.vector.api       :as vector]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn country-name-order
  ; @param (keyword)(opt) country-code
  ; Default: @DEFAULT-COUNTRY-CODE
  ;
  ; @usage
  ; (country-name-order :us)
  ; =>
  ; :normal
  ;
  ; @usage
  ; (country-name-order :hu)
  ; =>
  ; :reversed
  ;
  ; @return (keyword)
  ; :normal, :reversed
  ([]
   (country-name-order @core.state/DEFAULT-COUNTRY-CODE))

  ([country-code]
   (if (vector/contains-item? name.config/REVERSED-NAME-ORDER-COUNTRIES country-code)
       (-> :reversed)
       (-> :normal))))

(defn format-name
  ; @param (string) first-name
  ; @param (string) last-name
  ; @param (keyword)(opt) country-code
  ; Default: @DEFAULT-COUNTRY-CODE
  ;
  ; @usage
  ; (format-name "John" "Doe" :us)
  ; =>
  ; "John Doe"
  ;
  ; @usage
  ; (format-name "John" "Doe" :hu)
  ; =>
  ; "Doe John"
  ;
  ; @return (string)
  ([first-name last-name]
   (format-name first-name last-name @core.state/DEFAULT-COUNTRY-CODE))

  ([first-name last-name country-code]
   (case (country-name-order country-code)
         :reversed (str last-name  " " first-name)
         :normal   (str first-name " " last-name))))

(defn name-initials
  ; @param (string) first-name
  ; @param (string) last-name
  ; @param (keyword)(opt) country-code
  ; Default: @DEFAULT-COUNTRY-CODE
  ;
  ; @usage
  ; (name-initials "John" "Doe" :us)
  ; =>
  ; "JD"
  ;
  ; @usage
  ; (name-initials "John" "Doe" :hu)
  ; =>
  ; "DJ"
  ;
  ; @return (string)
  ([first-name last-name]
   (name-initials first-name last-name @core.state/DEFAULT-COUNTRY-CODE))

  ([first-name last-name country-code]
   (case (country-name-order country-code)
         :reversed (str (first last-name)  (first first-name))
         :normal   (str (first first-name) (first last-name)))))
