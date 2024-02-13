
(ns app-locales.core.state
    #?(:cljs (:require [reagent.core :as reagent])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @description
; Default value of the contry code parameter in locale functions.
;
; @atom (map)
; Default: :us
;
; @usage
; (deref DEFAULT-COUNTRY-CODE)
; =>
; :us
(def DEFAULT-COUNTRY-CODE #?(:clj  (atom         :us)
                             :cljs (reagent/atom :us)))
