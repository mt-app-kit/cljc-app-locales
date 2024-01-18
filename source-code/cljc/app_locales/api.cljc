
(ns app-locales.api
    (:require [app-locales.address.utils     :as address.utils]
              [app-locales.core.side-effects :as core.side-effects]
              [app-locales.core.state        :as core.state]
              [app-locales.country.config    :as country.config]
              [app-locales.country.utils     :as country.utils]
              [app-locales.currency.config   :as currency.config]
              [app-locales.name.config       :as name.config]
              [app-locales.name.utils        :as name.utils]
              [app-locales.name.views        :as name.views]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (app-locales.address.utils/*)
(def format-address address.utils/format-address)

; @redirect (app-locales.core.state/*)
(def SELECTED-LOCALE core.state/SELECTED-LOCALE)

; @redirect (app-locales.core.side-effects/*)
(def select-locale! core.side-effects/select-locale!)

; @redirect (app-locales.country.config/*)
(def COUNTRY-NAMES    country.config/COUNTRY-NAMES)
(def EU-COUNTRY-NAMES country.config/EU-COUNTRY-NAMES)
(def COUNTRY-LIST     country.config/COUNTRY-LIST)

; @redirect (app-locales.country.utils/*)
(def country-capital-city country.utils/country-capital-city)
(def country-currencies   country.utils/country-currencies)
(def country-currency     country.utils/country-currency)
(def country-languages    country.utils/country-languages)
(def country-language     country.utils/country-language)
(def country-name         country.utils/country-name)
(def country-native-name  country.utils/country-native-name)

; @redirect (app-locales.currency.config/*)
(def CURRENCY-SYMBOLS currency.config/CURRENCY-SYMBOLS)
(def CURRENCY-LIST    currency.config/CURRENCY-LIST)

; @redirect (app-locales.name.config/*)
(def REVERSED-NAME-ORDER-COUNTRIES name.config/REVERSED-NAME-ORDER-COUNTRIES)

; @redirect (app-locales.name.utils/*)
(def country-name-order name.utils/country-name-order)
(def format-name        name.utils/format-name)
(def name-initials      name.utils/name-initials)

; @redirect (app-locales.name.views/*)
(def in-name-order name.views/in-name-order)
