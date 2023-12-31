
(ns app-locales.name.views
    (:require [app-locales.core.state :as core.state]
              [app-locales.name.utils :as name.utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn in-name-order
  ; @param (hiccup or string) first-name
  ; @param (hiccup or string) last-name
  ; @param (keyword)(opt) country-code
  ; Default: @SELECTED-LOCALE
  ;
  ; @usage
  ; (in-name-order [:input {:type :text :placeholder "First name"}]
  ;                [:input {:type :text :placeholder "Last name"}]
  ;                :us]
  ; =>
  ; [:<> [:input {:type :text :placeholder "First name"}]
  ;      [:input {:type :text :placeholder "Last name"}]]
  ;
  ; @return (hiccup)
  ([first-name last-name]
   (in-name-order first-name last-name @core.state/SELECTED-LOCALE))

  ([first-name last-name country-code]
   (case (name.utils/country-name-order country-code)
         :reversed [:<> last-name  first-name]
         :normal   [:<> first-name last-name])))
