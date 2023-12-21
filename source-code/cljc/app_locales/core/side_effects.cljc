
(ns app-locales.core.side-effects
    (:require [app-locales.core.state :as core.state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn select-locale!
  ; @description
  ; Sets the selected locale.
  ;
  ; @param (keyword) country-code
  ;
  ; @usage
  ; (select-locale! :us)
  [country-code]
  (reset! core.state/SELECTED-LOCALE country-code))
