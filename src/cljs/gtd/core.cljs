(ns gtd.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [cljs.core.async :refer [put! chan <!]]
            [clojure.data :as data]
            [clojure.string :as string]))
(defn main-view [app owner]
  (reify
    om/IRender
    (render [this]
        (dom/h2 nil "Hello world!"))))

(om/root main-view nil
         {:target (. js/document (getElementById "content"))})
