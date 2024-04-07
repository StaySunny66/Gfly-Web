<template>
    <codemirror class="custom-codemirror"
        v-model="code"
        placeholder="Code gose here..."
        :autofocus="true"
        :indent-with-tab="true"
        :tabSize="2"
        :height ="'500px'"
        :extensions="extensions"
        @ready="log('ready', $event)"
        @change="log('change', $event)"
        @focus="log('focus', $event)"
        @blur="log('blur', $event)"
    />
</template>

<script>
import { Codemirror } from "vue-codemirror";
import { javascript } from "@codemirror/lang-javascript";
import { oneDark } from "@codemirror/theme-one-dark";

import { ref } from "vue";
export default {
  components: {
    Codemirror,
  },
  setup() {
    const code = ref(`console.log('Hello, world!')`);
    const extensions = [javascript(), oneDark];

    return {
      code,
      extensions,
      log: console.log,
    };
  },
};
</script>

<style scoped>
.custom-codemirror {
  height: 500px; /* 调整高度为你需要的值 */
}

</style>