<template>

    <v-data-table
        :headers="headers"
        :items="processView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ProcessViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            processView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/processViews'))

            temp.data._embedded.processViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.processView = temp.data._embedded.processViews;
        },
        methods: {
        }
    }
</script>

