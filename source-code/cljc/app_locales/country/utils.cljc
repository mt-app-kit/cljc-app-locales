
(ns app-locales.country.utils
    (:require [app-locales.country.config :as country.config]
              [app-locales.core.state :as core.state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn country-capital-city
  ; @description
  ; Returns the name of the capital city of the given country.
  ;
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @usage
  ; (country-capital-name :hu)
  ; =>
  ; "Budapest"
  ;
  ; @return (string)
  ([]
   (country-capital-city @core.state/SELECTED-LOCALE))

  ([country-code]
   (get-in country.config/COUNTRY-LIST [country-code :capital])))

(defn country-currencies
  ; @description
  ; Returns the official currencies of the given country.
  ;
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @example
  ; (country-currencies :hu)
  ; =>
  ; ["HUF"]
  ;
  ; @return (strings in vector)
  ([]
   (country-currencies @core.state/SELECTED-LOCALE))

  ([country-code]
   (get-in country.config/COUNTRY-LIST [country-code :currency])))

(defn country-currency
  ; @description
  ; Returns the first official currency of the given country.
  ;
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @example
  ; (country-currency :hu)
  ; =>
  ; "HUF"
  ;
  ; @return (string)
  ([]
   (country-currency @core.state/SELECTED-LOCALE))

  ([country-code]
   (let [country-currencies (country-currencies country-code)]
        (first country-currencies))))

(defn country-languages
  ; @description
  ; Returns the official languages of the given country.
  ;
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @example
  ; (country-languages :hu)
  ; =>
  ; ["hu"]
  ;
  ; @return (vector)
  ([]
   (country-languages @core.state/SELECTED-LOCALE))

  ([country-code]
   (get-in country.config/COUNTRY-LIST [country-code :languages])))

(defn country-language
  ; @description
  ; Returns the first official language of the given country.
  ;
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @example
  ; (country-language :hu)
  ; =>
  ; "hu"
  ;
  ; @return (string)
  ([]
   (country-language @core.state/SELECTED-LOCALE))

  ([country-code]
   (let [country-languages (country-languages country-code)]
        (first country-languages))))

(defn country-name
  ; @description
  ; Returns the official name of the given country.
  ;
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @example
  ; (country-name :hu)
  ; =>
  ; "Hungary"
  ;
  ; @return (string)
  ([]
   (country-name @core.state/SELECTED-LOCALE))

  ([country-code]
   (get-in country.config/COUNTRY-LIST [country-code :name])))

(defn country-native-name
  ; @description
  ; Returns the native name of the given country.
  ;
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @example
  ; (country-native-name :hu)
  ; =>
  ; "Magyarország"
  ;
  ; @return (string)
  ([]
   (country-native-name @core.state/SELECTED-LOCALE))

  ([country-code]
   (get-in country.config/COUNTRY-LIST [country-code :native])))
