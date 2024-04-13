{:npm-deps
 {; shadow cljs creates package.json 
  ; based on this dependencies 

  ; video
 ; "react-player" "^2.16.0"
 
  "react-youtube" "^10.1.0"

  ; this is only included because
  ; process is part of the node-libs-browser polyfill package to provide node-native package support
  ; for none-node builds. You should install shadow-cljs in your project to provide that dependency.


  "shadow-cljs" "^2.28.3"


 ;
  }}
