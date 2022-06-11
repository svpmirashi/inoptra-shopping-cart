# inoptra-shopping-cart-application



**Build:** 

Build application from project's root directory ('inoptra-shopping-cart\')

>_mvn clean install -DskipTests_

</br>

**Run:**

Run application jar from 'target\' directory in the project root ('inoptra-shopping-cart\target')

>_java -jar inoptra-shopping-cart-0.0.1-SNAPSHOT.jar_


<table>
    <thead>
        <td>HTTP Method</td>
        <td>API</td>
        <td>Path Variable / Query Params</td>
        <td>Request Body / Payload</td>
        <td>Example</td>
        <td>Sample Response</td>
    </thead>
    <tbody>
        <tr>
            <td>GET</td>
            <td>/products/all</td>
            <td>name, title</td>
            <td>N/A</td>
            <td>
                <p>http://localhost:8080/products/all?name=iPhone 13 Pro Max</p>
<p>http://localhost:8080/products/all?title=iPhone 13 Pro Max</p>
            </td>
            <td>
                <code>
                    [
                        {
                            "id": 1,
                            "name": "iPhone 13 Pro Max",
                            "title": "iPhone 13 Pro Max",
                            "brand": "iPhone",
                            "color": "Black",
                            "basePrice": 139900.0,
                            "vendorName": "ABC Electronics",
                            "mfgDate": "2022-05-01",
                            "expiryDate": "2022-05-15",
                            "createdBy": "testUser1",
                            "createdDate": "2022-08-06",
                            "modifiedBy": "testUser1",
                            "modifiedDate": "2022-08-06"
                        },
                        {
                            "id": 2,
                            "name": "iPhone 13 Pro Max",
                            "title": "iPhone 13 Pro Max",
                            "brand": "iPhone",
                            "color": "Baby Pink",
                            "basePrice": 139900.0,
                            "vendorName": "ABC Electronics",
                            "mfgDate": "2022-05-01",
                            "expiryDate": "2022-05-15",
                            "createdBy": "testUser1",
                            "createdDate": "2022-08-06",
                            "modifiedBy": "testUser1",
                            "modifiedDate": "2022-08-06"
                        }
                    ]
                </code>
            </td>
        </tr>
        <tr>
            <td>GET</td>
            <td>/products/{id}</td>
            <td>id</td>
            <td>N/A</td>
            <td>
                <p>http://localhost:8080/products/2</p>
            </td>
            <td>
                <code>
                {
                    "id": 2,
                    "name": "iPhone 13 Pro Max",
                    "title": "iPhone 13 Pro Max",
                    "brand": "iPhone",
                    "color": "Baby Pink",
                    "basePrice": 139900.0,
                    "vendorName": "ABC Electronics",
                    "mfgDate": "2022-05-01",
                    "expiryDate": "2022-05-15",
                    "createdBy": "testUser1",
                    "createdDate": "2022-08-06",
                    "modifiedBy": "testUser1",
                    "modifiedDate": "2022-08-06"
                }
                </code>
            </td>
        </tr>
    </tbody>
</table>
