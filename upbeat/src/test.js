import { HexGrid, Layout, Hexagon, Text, Pattern, Path, Hex } from 'react-hexgrid';

function DrawGrid(size) {
  

  return (
    <div>
      <HexGrid width={1600} height={800} viewBox="-50 -50 100 100">
        {/* Grid with manually inserted hexagons */}
        <Layout size={{ x: 4, y: 4 }} flat={true} spacing={1.05} origin={{ x: 0, y: 0 }}>
          <Hexagon q={0} r={0} s={0}/>
          {/* Using pattern (defined below) to fill the hexagon */}
          {/*C0 */}
          <Hexagon q={0} s={1} r={-1}/>
          <Hexagon q={0} s={2} r={-2}/>
          <Hexagon q={0} s={3} r={-3}/>
          <Hexagon q={0} s={4} r={-4}/>
          <Hexagon q={0} s={5} r={-5}/>
          <Hexagon q={0} s={-1} r={1}/>
          <Hexagon q={0} s={-2} r={2}/>
          <Hexagon q={0} s={-3} r={3}/>
          <Hexagon q={0} s={-4} r={4}/>
          <Hexagon q={0} s={-5} r={5}/>
          {/*C1 */}
          <Hexagon q={1} s={0} r={-1}/>
          <Hexagon q={1} s={1} r={-2}/>
          <Hexagon q={1} s={2} r={-3}/>
          <Hexagon q={1} s={3} r={-4}/>
          <Hexagon q={1} s={4} r={-5}/>
          <Hexagon q={1} s={5} r={-6}/>
          <Hexagon q={1} s={0} r={0}/>
          <Hexagon q={1} s={-1} r={0}/>
          <Hexagon q={1} s={-2} r={1}/>
          <Hexagon q={1} s={-3} r={2}/>
          <Hexagon q={1} s={-4} r={3}/>
          <Hexagon q={1} s={-5} r={4}/>
          {/*C2 */}
          <Hexagon q={2} s={-1} r={-1}/>
          <Hexagon q={2} s={0} r={-2}/>
          <Hexagon q={2} s={1} r={-3}/>
          <Hexagon q={2} s={2} r={-4}/>
          <Hexagon q={2} s={3} r={-5}/>
          <Hexagon q={2} s={4} r={-6}/>
          <Hexagon q={2} s={1} r={1}/>
          <Hexagon q={2} s={-2} r={0}/>
          <Hexagon q={2} s={-3} r={1}/>
          <Hexagon q={2} s={-4} r={2}/>
          <Hexagon q={2} s={-5} r={3}/>
          <Hexagon q={2} s={-6} r={4}/>
          {/*C3 */}
          <Hexagon q={3} s={4} r={-7}/>
          <Hexagon q={3} s={3} r={-6}/>
          <Hexagon q={3} s={2} r={-5}/>
          <Hexagon q={3} s={1} r={-4}/>
          <Hexagon q={3} s={0} r={-3}/>
          <Hexagon q={3} s={-1} r={-2}/>
          <Hexagon q={3} s={-2} r={-1}/>
          <Hexagon q={3} s={-3} r={0}/>
          <Hexagon q={3} s={-4} r={1}/>
          <Hexagon q={3} s={-5} r={2}/>
          <Hexagon q={3} s={-6} r={3}/>
               
          {/*C4 */}
          <Hexagon q={4} s={-2} r={-2}/>
          <Hexagon q={4} s={-1} r={-3}/>
          <Hexagon q={4} s={0} r={-4}/>
          <Hexagon q={4} s={1} r={-5}/>
          <Hexagon q={4} s={2} r={-6}/>
          <Hexagon q={4} s={3} r={-7}/>
          {/*C5 */}
          <Hexagon q={5} s={-3} r={-3}/>
          <Hexagon q={5} s={-2} r={-4}/>
          <Hexagon q={5} s={-1} r={-5}/>
          <Hexagon q={5} s={0} r={-6}/>
          <Hexagon q={5} s={1} r={-7}/>
          <Hexagon q={5} s={2} r={-8}/>
          {/*C6 */}
          <Hexagon q={6} s={-4} r={-3}/>
          <Hexagon q={6} s={-3} r={-4}/>
          <Hexagon q={6} s={-2} r={-5}/>
          <Hexagon q={6} s={-1} r={-6}/>
          <Hexagon q={6} s={0} r={-7}/>
          <Hexagon q={6} s={1} r={-8}/>
          {/*C7 */}
          <Hexagon q={7} s={-5} r={-4}/>
          <Hexagon q={7} s={-4} r={-5}/>
          <Hexagon q={7} s={-3} r={-6}/>
          <Hexagon q={7} s={-2} r={-7}/>
          <Hexagon q={7} s={-1} r={-8}/>
          <Hexagon q={7} s={0} r={-9}/>
          {/*C-1 */}
          <Hexagon q={-1} s={1} r={0}/>
          <Hexagon q={-1} s={2} r={-1}/>
          <Hexagon q={-1} s={3} r={-2}/>
          <Hexagon q={-1} s={4} r={-3}/>
          <Hexagon q={-1} s={5} r={-4}/>
          <Hexagon q={-1} s={6} r={-5}/>
          {/*C-2 */}
          <Hexagon q={-2} s={1} r={1}/>
          <Hexagon q={-2} s={2} r={0}/>
          <Hexagon q={-2} s={3} r={-1}/>
          <Hexagon q={-2} s={4} r={-2}/>
          <Hexagon q={-2} s={5} r={-3}/>
          <Hexagon q={-2} s={6} r={-4}/>
          {/*C-3 */}
          <Hexagon q={-3} s={3} r={1}/>
          <Hexagon q={-3} s={2} r={0}/>
          <Hexagon q={-3} s={1} r={-1}/>
          <Hexagon q={-3} s={0} r={-2}/>
          <Hexagon q={-3} s={-1} r={-3}/>
          <Hexagon q={-3} s={-2} r={-4}/>
          {/*C-4 */}
          <Hexagon q={-4} s={2} r={2}/>
          <Hexagon q={-4} s={3} r={1}/>
          <Hexagon q={-4} s={4} r={0}/>
          <Hexagon q={-4} s={5} r={-1}/>
          <Hexagon q={-4} s={6} r={-2}/>
          <Hexagon q={-4} s={7} r={-3}/>
          {/*C-5 */}
          <Hexagon q={-5} s={3} r={2}/>
          <Hexagon q={-5} s={4} r={1}/>
          <Hexagon q={-5} s={5} r={0}/>
          <Hexagon q={-5} s={6} r={-1}/>
          <Hexagon q={-5} s={7} r={-2}/>
          <Hexagon q={-5} s={8} r={-3}/>
          {/*C-6 */}
          <Hexagon q={-6} s={3} r={3}/>
          <Hexagon q={-6} s={4} r={2}/>
          <Hexagon q={-6} s={5} r={1}/>
          <Hexagon q={-6} s={6} r={0}/>
          <Hexagon q={-6} s={7} r={-1}/>
          <Hexagon q={-6} s={8} r={-2}/>
          {/*C-7 */}
          <Hexagon q={-7} s={3} r={3}/>
          <Hexagon q={-7} s={4} r={2}/>
          <Hexagon q={-7} s={5} r={1}/>
          <Hexagon q={-7} s={6} r={0}/>
          <Hexagon q={-7} s={7} r={-1}/>
          <Hexagon q={-7} s={8} r={-2}/>
          <Path start={new Hex(0, 0, 0)} end={new Hex(0, 0, 0)} />
        </Layout>

      </HexGrid>
      
    </div>
  );  
}
export default DrawGrid;

