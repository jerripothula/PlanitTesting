async function getPets() {
  let response = await fetch(
    "https://petstore.swagger.io/v2/pet/findByStatus?status=available"
  );
  let data = await response.json();
  console.log(data.length);
}

getPets();
