
(ns app-locales.core.side-effects
    (:require [app-locales.core.state :as core.state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn set-default-country-code!
  ; @description
  ; Sets the default country code.
  ;
  ; @param (keyword) country-code
  ;
  ; @usage
  ; (set-default-country-code! :us)
  [country-code]
  (reset! core.state/DEFAULT-COUNTRY-CODE country-code))
