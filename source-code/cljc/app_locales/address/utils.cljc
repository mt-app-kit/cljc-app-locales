
(ns app-locales.address.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn format-address
  ; @param (string) country
  ; @param (string) postal-code
  ; @param (string) city
  ; @param (string) address
  ; @param (keyword) format
  ; :stg (Specific To General), :gts (General To Specific)
  ; Default: :gts
  ;
  ; @usage
  ; (format-address "US" "19806" "Bradford" "537 Paper Street" :stg)
  ; =>
  ; "US, 537 Paper Street, Bradford, 19806"
  ;
  ; @usage
  ; (format-address "HU" "1025" "Budapest" "Minta utca 123." :gts)
  ; =>
  ; "HU, 1025 Budapest, Minta utca 123."
  ;
  ; @return (string)
  ([postal-code country city address]
   (format-address postal-code country city address :gts))

  ([postal-code country city address format]
   (case format :gts (str country ", " postal-code " "  city ", " address)
                :stg (str country ", " address     ", " city ", " postal-code)
                     (str country ", " postal-code " "  city ", " address))))
