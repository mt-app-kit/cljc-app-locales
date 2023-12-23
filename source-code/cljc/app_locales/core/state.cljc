
(ns app-locales.core.state
    #?(:cljs (:require [reagent.api :refer [ratom]])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @atom (map)
;
; @usage
; (deref SELECTED-LOCALE)
; =>
; :us
(def SELECTED-LOCALE #?(:clj  (atom  :us)
                        :cljs (ratom :us)))
