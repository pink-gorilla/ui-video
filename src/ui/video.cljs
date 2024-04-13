(ns ui.video
  (:require
   ;["react-player" :refer [ReactPlayer]]
   ["react-youtube" :as [YouTube]]
   ))

#_(defn video
  "plays Youtube videos
   usage:
   ['ui.video/video {:url url :playing false}]
   
   for more config options, see:
   https://www.npmjs.com/package/react-player
   "
  [props]
  [:> ReactPlayer props]) ; {:url url :playing true}


(defn youtube
  "plays Youtube videos
   usage:
   ['ui.video/youtube {:url url :playing false}]
   
   for more config options, see:
   https://www.npmjs.com/package/react-youtube
   "
  [props]
  [:> YouTube props])
