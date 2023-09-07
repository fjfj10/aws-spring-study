import axios from "axios"

//공통 인자들을 넣어둔다?
export const api = axios.create({
    baseURL: "http://localhost:8080"
})

export default api;