var app = new Vue({
    el: "#app",
    data: {
        data: {}
    },
    methods: {
        getPersonajes: function () {
            axios.get("/api/personajes")
                .then((response) => {
                    //get client ifo
                    this.data = response.data;
                })
                .catch((error) => {
                    this.errorMsg = "Error al obtener datos";
                })
        },
    },
    mounted: function () {
        this.getPersonajes();
    }
})