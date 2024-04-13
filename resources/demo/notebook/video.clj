(ns demo.notebook.video)

;; video

 

(defn youtube [id]
  ['ui.video/youtube {:videoId id
                      :opts {:height "390" 
                             :width "640"}}])

(defn show-video [[name id]]
  [:div
   [:h1.text-xl.text-blue-900 name]
   (youtube id)])

(defn video-list [name list]
  ^:R
  [:div
   [:h1.text-3xl.text-blue-900 name]
   (into [:div]
         (map show-video list))])

(def videos
  {:sniffer-repl "HxejHqw4jfI"
   :notebook "8TwXaVTZ1G8"
   :clojisr "BbjYkDmp3fg"})

^:R
[:div.bg-blue-500 ; test how background is on different color
 [:h1 "How to use goldly"]
 (video-list "unsorted videos" videos)]