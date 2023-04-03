import { HexGrid, Layout, Hexagon, Text, Pattern, Path, Hex } from 'react-hexgrid';

function DrawGrid(size) {
  

  return (
    <div>
      <HexGrid width={1600} height={1000} viewBox="-50 -50 100 200">
        {/* Grid with manually inserted hexagons */}
        <Layout size={{ x: 3.8, y: 3.8 }} flat={true} spacing={1.05} origin={{ x: 0, y: 0 }}>
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
          <Hexagon q={0} s={-1} r={6}/>
          <Hexagon q={0} s={-2} r={7}/>
          <Hexagon q={0} s={-3} r={8}/>
          <Hexagon q={0} s={-4} r={9}/>
          <Hexagon q={0} s={-5} r={10}/>
          <Hexagon q={0} s={-1} r={11}/>
          <Hexagon q={0} s={-2} r={12}/>
          <Hexagon q={0} s={-3} r={13}/>
          <Hexagon q={0} s={-4} r={14}/>
          
          {/*C1 */}
          <Hexagon q={1} s={5} r={-6}/>
          <Hexagon q={1} s={4} r={-5}/>
          <Hexagon q={1} s={3} r={-4}/>
          <Hexagon q={1} s={2} r={-3}/>
          <Hexagon q={1} s={1} r={-2}/>
          <Hexagon q={1} s={0} r={-1}/>
          <Hexagon q={1} s={-1} r={0}/>
          <Hexagon q={1} s={-2} r={1}/>
          <Hexagon q={1} s={-3} r={2}/>
          <Hexagon q={1} s={-4} r={3}/>
          <Hexagon q={1} s={-5} r={4}/>
          <Hexagon q={1} s={-6} r={5}/>
          <Hexagon q={1} s={-7} r={6}/>
          <Hexagon q={1} s={-8} r={7}/>
          <Hexagon q={1} s={-9} r={8}/>
          <Hexagon q={1} s={-10} r={9}/>
          <Hexagon q={1} s={-11} r={10}/>
          <Hexagon q={1} s={-12} r={11}/>
          <Hexagon q={1} s={-13} r={12}/>
          <Hexagon q={1} s={-14} r={13}/>
          {/*C2 */}
          <Hexagon q={2} s={4} r={-6}/>
          <Hexagon q={2} s={3} r={-5}/>
          <Hexagon q={2} s={2} r={-4}/>
          <Hexagon q={2} s={1} r={-3}/>
          <Hexagon q={2} s={0} r={-2}/>
          <Hexagon q={2} s={-1} r={-1}/>
          <Hexagon q={2} s={-2} r={0}/>
          <Hexagon q={2} s={-3} r={1}/>
          <Hexagon q={2} s={-4} r={2}/>
          <Hexagon q={2} s={-5} r={3}/>
          <Hexagon q={2} s={-6} r={4}/>
          <Hexagon q={2} s={-7} r={5}/>
          <Hexagon q={2} s={-8} r={6}/>
          <Hexagon q={2} s={-9} r={7}/>
          <Hexagon q={2} s={-10} r={8}/>
          <Hexagon q={2} s={-11} r={9}/>
          <Hexagon q={2} s={-12} r={10}/>
          <Hexagon q={2} s={-13} r={11}/>
          <Hexagon q={2} s={-14} r={12}/>
          <Hexagon q={2} s={-15} r={13}/>
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
          <Hexagon q={3} s={-7} r={4}/>
          <Hexagon q={3} s={-8} r={5}/>
          <Hexagon q={3} s={-9} r={6}/>
          <Hexagon q={3} s={-10} r={7}/>
          <Hexagon q={3} s={-11} r={8}/>
          <Hexagon q={3} s={-12} r={9}/>
          <Hexagon q={3} s={-13} r={10}/>
          <Hexagon q={3} s={-14} r={11}/>
          <Hexagon q={3} s={-15} r={12}/>    
          {/*C4 */}
          <Hexagon q={4} s={3} r={-7}/>
          <Hexagon q={4} s={2} r={-6}/>
          <Hexagon q={4} s={1} r={-5}/>
          <Hexagon q={4} s={0} r={-4}/>
          <Hexagon q={4} s={-1} r={-3}/>
          <Hexagon q={4} s={-2} r={-2}/>
          <Hexagon q={4} s={-3} r={-1}/>
          <Hexagon q={4} s={-4} r={0}/>
          <Hexagon q={4} s={-5} r={1}/>
          <Hexagon q={4} s={-6} r={2}/>
          <Hexagon q={4} s={-7} r={3}/>
          <Hexagon q={4} s={-8} r={4}/>
          <Hexagon q={4} s={-9} r={5}/>
          <Hexagon q={4} s={-10} r={6}/>
          <Hexagon q={4} s={-11} r={7}/>
          <Hexagon q={4} s={-12} r={8}/>
          <Hexagon q={4} s={-13} r={9}/>
          <Hexagon q={4} s={-14} r={10}/>
          <Hexagon q={4} s={-15} r={11}/>
          <Hexagon q={4} s={-16} r={12}/>
          {/*C5 */}
          <Hexagon q={5} s={3} r={-8}/>
          <Hexagon q={5} s={2} r={-7}/>
          <Hexagon q={5} s={1} r={-6}/>
          <Hexagon q={5} s={0} r={-5}/>
          <Hexagon q={5} s={-1} r={-4}/>
          <Hexagon q={5} s={-2} r={-3}/>
          <Hexagon q={5} s={-3} r={-2}/>
          <Hexagon q={5} s={-4} r={-1}/>
          <Hexagon q={5} s={-5} r={0}/>
          <Hexagon q={5} s={-6} r={1}/>
          <Hexagon q={5} s={-7} r={2}/>
          <Hexagon q={5} s={-8} r={3}/>
          <Hexagon q={5} s={-9} r={4}/>
          <Hexagon q={5} s={-10} r={5}/>
          <Hexagon q={5} s={-11} r={6}/>
          <Hexagon q={5} s={-12} r={7}/>
          <Hexagon q={5} s={-13} r={8}/>
          <Hexagon q={5} s={-14} r={9}/>
          <Hexagon q={5} s={-15} r={10}/>
          <Hexagon q={5} s={-16} r={11}/>
          {/*C6 */}
          <Hexagon q={6} s={2} r={-8}/>
          <Hexagon q={6} s={1} r={-7}/>
          <Hexagon q={6} s={0} r={-6}/>
          <Hexagon q={6} s={-1} r={-5}/>
          <Hexagon q={6} s={-2} r={-4}/>
          <Hexagon q={6} s={-3} r={-3}/>
          <Hexagon q={6} s={-4} r={-2}/>
          <Hexagon q={6} s={-5} r={-1}/>
          <Hexagon q={6} s={-6} r={0}/>
          <Hexagon q={6} s={-7} r={1}/>

          <Hexagon q={6} s={-8} r={2}/>
          <Hexagon q={6} s={-9} r={3}/>
          <Hexagon q={6} s={-10} r={4}/>
          <Hexagon q={6} s={-11} r={5}/>
          <Hexagon q={6} s={-12} r={6}/>
          <Hexagon q={6} s={-13} r={7}/>
          <Hexagon q={6} s={-14} r={8}/>
          <Hexagon q={6} s={-15} r={9}/>
          <Hexagon q={6} s={-16} r={10}/>
          <Hexagon q={6} s={-17} r={11}/>
          {/*C7 */}
          <Hexagon q={7} s={2} r={-9}/>
          <Hexagon q={7} s={1} r={-8}/>
          <Hexagon q={7} s={0} r={-7}/>
          <Hexagon q={7} s={-1} r={-6}/>
          <Hexagon q={7} s={-2} r={-5}/>
          <Hexagon q={7} s={-3} r={-4}/>
          <Hexagon q={7} s={-4} r={-3}/>
          <Hexagon q={7} s={-5} r={-2}/>
          <Hexagon q={7} s={-6} r={-1}/>
          <Hexagon q={7} s={-7} r={0}/>
          <Hexagon q={7} s={-8} r={1}/>
          <Hexagon q={7} s={-9} r={2}/>
          <Hexagon q={7} s={-10} r={3}/>
          <Hexagon q={7} s={-11} r={4}/>
          <Hexagon q={7} s={-12} r={5}/>
          <Hexagon q={7} s={-13} r={6}/>
          <Hexagon q={7} s={-14} r={7}/>
          <Hexagon q={7} s={-15} r={8}/>
          <Hexagon q={7} s={-16} r={9}/>
          <Hexagon q={7} s={-17} r={10}/>
          {/*C-1 */}
          <Hexagon q={-1} s={6} r={-5}/>
          <Hexagon q={-1} s={5} r={-4}/>
          <Hexagon q={-1} s={4} r={-3}/>
          <Hexagon q={-1} s={3} r={-2}/>
          <Hexagon q={-1} s={2} r={-1}/>
          <Hexagon q={-1} s={1} r={0}/>
          <Hexagon q={-1} s={0} r={1}/>
          <Hexagon q={-1} s={-1} r={2}/>
          <Hexagon q={-1} s={-2} r={3}/>
          <Hexagon q={-1} s={-3} r={4}/>
          <Hexagon q={-1} s={-4} r={5}/>
          <Hexagon q={-1} s={-5} r={6}/>
          <Hexagon q={-1} s={-6} r={7}/>
          <Hexagon q={-1} s={-7} r={8}/>
          <Hexagon q={-1} s={-8} r={9}/>
          <Hexagon q={-1} s={-9} r={10}/>
          <Hexagon q={-1} s={-10} r={11}/>
          <Hexagon q={-1} s={-11} r={12}/>
          <Hexagon q={-1} s={-12} r={13}/>
          <Hexagon q={-1} s={-13} r={14}/>
          {/*C-2 */}
          <Hexagon q={-2} s={6} r={-4}/>
          <Hexagon q={-2} s={5} r={-3}/>
          <Hexagon q={-2} s={4} r={-2}/>
          <Hexagon q={-2} s={3} r={-1}/>
          <Hexagon q={-2} s={2} r={0}/>
          <Hexagon q={-2} s={1} r={1}/>
          <Hexagon q={-2} s={0} r={2}/>
          <Hexagon q={-2} s={-1} r={3}/>
          <Hexagon q={-2} s={-2} r={4}/>
          <Hexagon q={-2} s={-3} r={5}/>
          <Hexagon q={-2} s={-4} r={6}/>
          <Hexagon q={-2} s={-5} r={7}/>
          <Hexagon q={-2} s={-6} r={8}/>
          <Hexagon q={-2} s={-7} r={9}/>
          <Hexagon q={-2} s={-8} r={10}/>
          <Hexagon q={-2} s={-9} r={11}/>
          <Hexagon q={-2} s={-10} r={12}/>
          <Hexagon q={-2} s={-11} r={13}/>
          <Hexagon q={-2} s={-12} r={14}/>
          <Hexagon q={-2} s={-13} r={15}/>
          {/*C-3 */}
          <Hexagon q={-3} s={7} r={-4}/>
          <Hexagon q={-3} s={6} r={-3}/>
          <Hexagon q={-3} s={5} r={-2}/>
          <Hexagon q={-3} s={4} r={-1}/>
          <Hexagon q={-3} s={3} r={0}/>
          <Hexagon q={-3} s={2} r={1}/>
          <Hexagon q={-3} s={1} r={2}/>
          <Hexagon q={-3} s={0} r={3}/>
          <Hexagon q={-3} s={-1} r={4}/>
          <Hexagon q={-3} s={-2} r={5}/>
          <Hexagon q={-3} s={-3} r={6}/>
          <Hexagon q={-3} s={-4} r={7}/>
          <Hexagon q={-3} s={-5} r={8}/>
          <Hexagon q={-3} s={-6} r={9}/>
          <Hexagon q={-3} s={-7} r={10}/>
          <Hexagon q={-3} s={-8} r={11}/>
          <Hexagon q={-3} s={-9} r={12}/>
          <Hexagon q={-3} s={-10} r={13}/>
          <Hexagon q={-3} s={-11} r={14}/>
          <Hexagon q={-3} s={-12} r={15}/>
          {/*C-4 */}
          <Hexagon q={-4} s={7} r={-3}/>
          <Hexagon q={-4} s={6} r={-2}/>
          <Hexagon q={-4} s={5} r={-1}/>
          <Hexagon q={-4} s={4} r={0}/>
          <Hexagon q={-4} s={3} r={1}/>
          <Hexagon q={-4} s={2} r={2}/>
          <Hexagon q={-4} s={1} r={3}/>
          <Hexagon q={-4} s={0} r={4}/>
          <Hexagon q={-4} s={-1} r={5}/>
          <Hexagon q={-4} s={-2} r={6}/>
          <Hexagon q={-4} s={-3} r={7}/>
          <Hexagon q={-4} s={-4} r={8}/>
          <Hexagon q={-4} s={-5} r={9}/>
          <Hexagon q={-4} s={-6} r={10}/>
          <Hexagon q={-4} s={-7} r={11}/>
          <Hexagon q={-4} s={-8} r={12}/>
          <Hexagon q={-4} s={-9} r={13}/>
          <Hexagon q={-4} s={-10} r={14}/>
          <Hexagon q={-4} s={-11} r={15}/>
          <Hexagon q={-4} s={-12} r={16}/>
          {/*C-5 */}
          <Hexagon q={-5} s={8} r={-3}/>
          <Hexagon q={-5} s={7} r={-2}/>
          <Hexagon q={-5} s={6} r={-1}/>
          <Hexagon q={-5} s={5} r={0}/>
          <Hexagon q={-5} s={4} r={1}/>
          <Hexagon q={-5} s={3} r={2}/>
          <Hexagon q={-5} s={2} r={3}/>
          <Hexagon q={-5} s={1} r={4}/>
          <Hexagon q={-5} s={0} r={5}/>
          <Hexagon q={-5} s={-1} r={6}/>
          <Hexagon q={-5} s={-2} r={7}/>
          <Hexagon q={-5} s={-3} r={8}/>
          <Hexagon q={-5} s={-4} r={9}/>
          <Hexagon q={-5} s={-5} r={10}/>
          <Hexagon q={-5} s={-6} r={11}/>
          <Hexagon q={-5} s={-7} r={12}/>
          <Hexagon q={-5} s={-8} r={13}/>
          <Hexagon q={-5} s={-9} r={14}/>
          <Hexagon q={-5} s={-10} r={15}/>
          <Hexagon q={-5} s={-11} r={16}/>
          {/*C-6 */}
          <Hexagon q={-6} s={8} r={-2}/>
          <Hexagon q={-6} s={7} r={-1}/>
          <Hexagon q={-6} s={6} r={0}/>
          <Hexagon q={-6} s={5} r={1}/>
          <Hexagon q={-6} s={4} r={2}/>
          <Hexagon q={-6} s={3} r={3}/>
          <Hexagon q={-6} s={2} r={4}/>
          <Hexagon q={-6} s={1} r={5}/>
          <Hexagon q={-6} s={0} r={6}/>
          <Hexagon q={-6} s={-1} r={7}/>
          <Hexagon q={-6} s={-2} r={8}/>
          <Hexagon q={-6} s={-3} r={9}/>
          <Hexagon q={-6} s={-4} r={10}/>
          <Hexagon q={-6} s={-5} r={11}/>
          <Hexagon q={-6} s={-6} r={12}/>
          <Hexagon q={-6} s={-7} r={13}/>
          <Hexagon q={-6} s={-8} r={14}/>
          <Hexagon q={-6} s={-9} r={15}/>
          <Hexagon q={-6} s={-10} r={16}/>
          <Hexagon q={-6} s={-11} r={17}/>
          {/*C-7 */}
          <Hexagon q={-7} s={9} r={-2}/>
          <Hexagon q={-7} s={8} r={-1}/>
          <Hexagon q={-7} s={7} r={0}/>
          <Hexagon q={-7} s={6} r={1}/>
          <Hexagon q={-7} s={5} r={2}/>
          <Hexagon q={-7} s={4} r={3}/>
          <Hexagon q={-7} s={3} r={4}/>
          <Hexagon q={-7} s={2} r={5}/>
          <Hexagon q={-7} s={1} r={6}/>
          <Hexagon q={-7} s={0} r={7}/>
          <Hexagon q={-7} s={-1} r={8}/>
          <Hexagon q={-7} s={-2} r={9}/>
          <Hexagon q={-7} s={-3} r={10}/>
          <Hexagon q={-7} s={-4} r={11}/>
          <Hexagon q={-7} s={-5} r={12}/>
          <Hexagon q={-7} s={-6} r={13}/>
          <Hexagon q={-7} s={-7} r={14}/>
          <Hexagon q={-7} s={-8} r={15}/>
          <Hexagon q={-7} s={-9} r={16}/>
          <Hexagon q={-7} s={-10} r={17}/>
          <Path start={new Hex(0, 0, 0)} end={new Hex(0, 0, 0)} />
        </Layout>

      </HexGrid>
      
    </div>
  );  
}
export default DrawGrid;

