<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <script src="https://cdn.tailwindcss.com"></script>

    </head>

    <body class="dark:bg-gray-900">
        <c:import url="/header.jsp" />
        <div class=" flex flex-row justify-around">
            <div>
                <a href="singup.do">
                    <div
                        class="w-48 mt-8 ml-10 bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 ">

                        <img class="rounded-t-lg " src="./static/media/candidate.png" alt="" />

                        <div class="p-5">

                            <h5
                                class="mb-2 text-2xl font-bold tracking-tight text-gray-900 text-center dark:text-white">
                                login as candidate
                            </h5>
                        </div>
                    </div>
                </a>
            </div>
            <div>
                <a href="singup.do">
                    <div
                        class="max-w-48 mt-8  bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 ">

                        <img class="rounded-t-lg " src="./static/media/publisher.png" alt="" />

                        <div class="p-5">

                            <h5
                                class="mb-2 text-2xl font-bold tracking-tight text-gray-900 text-center dark:text-white">
                                login as publisher
                            </h5>
                        </div>
                    </div>
                </a>
            </div>
            <div>
                <a href="singup.do">
                    <div
                        class="max-w-48 mt-8  bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 ">

                        <img class="rounded-t-lg " src="./static/media/library.png" alt="" />

                        <div class="p-5">

                            <h5
                                class="mb-2 text-2xl font-bold tracking-tight text-gray-900 text-center dark:text-white">
                                login as library
                            </h5>
                        </div>
                    </div>
                </a>
            </div>
            <div>
                <a href="singup.do">
                    <div
                        class="max-w-48 mt-8 mr-10 bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 ">

                        <img class="rounded-t-lg " src="./static/media/librarian.png" alt="" />

                        <div class="p-5">

                            <h5
                                class="mb-2 text-2xl font-bold tracking-tight text-gray-900 text-center dark:text-white">
                                login as librarian
                            </h5>
                        </div>
                    </div>
                </a>
            </div>
            
        </div>
       
      
        <c:import url="/footer.jsp" />


    </body>

    </html>