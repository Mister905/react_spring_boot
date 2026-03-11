import axios from "axios";

const API = "http://localhost:8080/api/todos";

export interface Todo {
  id: number;
  title: string;
  completed: boolean;
}

const client = axios.create({
  baseURL: API,
  headers: { "Content-Type": "application/json" },
});

export const getTodos = async (): Promise<Todo[]> => {
  const { data } = await client.get<Todo[]>("");
  return data;
};

export const createTodo = async (title: string): Promise<Todo> => {
  const { data } = await client.post<Todo>("", { title, completed: false });
  return data;
};

export const deleteTodo = async (id: number): Promise<void> => {
  await client.delete(`/${id}`);
};
