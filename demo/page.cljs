(ns page
  (:require
   [ui.video :refer [youtube]]))


(defn demo-page [& _]
  [:div
   [:h1 "demo youtube video"]
   [youtube {:videoId "8TwXaVTZ1G8"
             :opts {:height "390"
                    :width "640"}}]])


