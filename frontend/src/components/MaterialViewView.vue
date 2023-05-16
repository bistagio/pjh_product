<template>

    <v-data-table
        :headers="headers"
        :items="materialView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MaterialViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            materialView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/materialViews'))

            temp.data._embedded.materialViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.materialView = temp.data._embedded.materialViews;
        },
        methods: {
        }
    }
</script>

