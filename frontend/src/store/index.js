import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

import router from "@/router";
import SERVER from "@/api/api";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    posts: [],
    searchData: { selected: "", word: "" }
  },
  mutations: {
    SET_POSTS(state, posts) {
      state.posts = posts;
    },
    SET_SEARCH_DATA(state, searchData) {
      state.searchData = searchData
    },
  },
  actions: {
    fetchsearchPost({ commit, state }, searchData) {
      commit("SET_SEARCH_DATA", searchData);
      axios
        .get(
          SERVER.URL +
            SERVER.ROUTES.searchpost +
            state.searchData.selected +
            "/" +
            state.searchData.word
        )
        .then((res) => commit("SET_POSTS", res.data))
        .catch((err) => console.error(err));
    },
  },
  modules: {},
});
