class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/without-tag-plugin"(view:"/without-tag-plugin")
        "/with-tag-plugin"(view:"/with-tag-plugin")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
