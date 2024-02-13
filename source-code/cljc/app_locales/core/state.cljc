
(ns app-locales.core.state
    #?(:cljs (:require [reagent.api :refer [ratom]])))

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
(def DEFAULT-COUNTRY-CODE #?(:clj  (atom  :us)
                             :cljs (ratom :us)))
